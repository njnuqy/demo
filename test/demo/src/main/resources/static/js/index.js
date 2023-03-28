    function animate(obj, target) {
        clearInterval(obj.timer);
        obj.timer = setInterval(function() {
            var step = (target - obj.offsetLeft) / 10;
            step = step > 0 ? Math.ceil(step) : Math.floor(step);
            if (obj.offsetLeft == target) {
                clearInterval(obj.timer);
            }
            obj.style.left = obj.offsetLeft + step + 'px';
        }, 15);
    }
    $('.Us').mouseover(function() {
        $('.aboutUs').show();
    });

    $('.Us').mouseout(function() {
        $('.aboutUs').hide();
    });

    $('.courSe').mouseover(function() {
        $('.course').show();
    });

    $('.courSe').mouseout(function() {
        $('.course').hide();
    });

    $('.promo').mouseover(function() {
        $('.arrow-l').show();
        $('.arrow-r').show();
        clearInterval(timer);
        timer = null;
    });

    $('.promo').mouseout(function() {
        $('.arrow-l').hide();
        $('.arrow-r').hide();
        timer = setInterval(function() {
            $('.arrow-r').click();
        }, 2000);
    });
    var num = 0;
    var circle = 0;
    var count = document.querySelector('.imgs');
    var ul = document.querySelector('.promo-nav')
    var promo = document.querySelector('.promo')
    var promoWidth = promo.offsetWidth;
    for (var i = 0; i < count.children.length; i++) {
        var li = document.createElement('li');
        li.setAttribute('index', i);
        if (i == 0) {
            li.className = 'current';
        }
        ul.appendChild(li);
        li.addEventListener('click', function() {
            for (var i = 0; i < ul.children.length; i++) {
                ul.children[i].className = '';
            }
            this.className = 'current';
            num = this.getAttribute("index");
            circle = num;
            var index = this.getAttribute('index');
            animate(count, -index * promoWidth);
        });
    }
    var firstImg = count.children[0].cloneNode(true);
    count.appendChild(firstImg);
    $('.arrow-r').click(function() {
        if (num == ul.children.length) {
            count.style.left = 0;
            num = 0;
        }
        num++;
        circle++;
        if (circle == ul.children.length) {
            circle = 0;
        }
        for (var i = 0; i < ul.children.length; i++) {
            ul.children[i].className = '';
        }
        ul.children[circle].className = 'current';
        animate(count, -num * promoWidth);
    });
    $('.arrow-l').click(function() {
        if (num == 0) {
            num = ul.children.length - 1;
            count.style.left = -num * promoWidth + 'px';
        }
        num--;
        circle--;
        if (circle < 0) {
            circle = ul.children.length - 1;
        }
        for (var i = 0; i < ul.children.length; i++) {
            ul.children[i].className = '';
        }
        ul.children[circle].className = 'current';
        animate(count, -num * promoWidth);
    });
    var timer = setInterval(function() {
        $('.arrow-r').click();
    }, 2000);

    $('.select').children().mouseover(function() {
        $(this).css("backgroundColor", "white").siblings().css("backgroundColor", "#ff5000");
        var n = $(this).attr("index");
        $('.DES').children('li').eq(n).show().siblings().hide();
    });