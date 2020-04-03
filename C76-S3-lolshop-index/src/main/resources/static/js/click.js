$(function(){
    $("body").click(function(e) {
        $("*").removeClass('selected');    // 先删除所有元素的selected样式
        $(e.target).addClass('selected');  // 然后为被点击元素添加selected样式
    });
})