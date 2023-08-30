$(document).ready(function(){
    // Sticky Navbar and "Go To Top" Button
    $(window).scroll(function(){
        if (this.scrollY > 20) {
            $(".navbar").addClass("sticky");
            $(".goTop").fadeIn();
        } else {
            $(".navbar").removeClass("sticky");
            $(".goTop").fadeOut();
        }
    });

    // Scroll to Top
    $(".goTop").click(function(){
        $("html, body").animate({ scrollTop: 0 }, "slow");
    });

    // Toggle Navbar Menu
    $(".menu-toggler").click(function(){
        $(this).toggleClass("active");
        $(".navbar-menu").toggleClass("active");
    });

    // Magnific Popup for Image Gallery
    $(".works").magnificPopup({
        delegate: 'a',
        type: 'image',
        gallery: { enabled: true }
    });
});
