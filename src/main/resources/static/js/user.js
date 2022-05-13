function register(){

    var verifyCode = $("#L_vercode").val();
    var mail = $("#L_email").val();
    var pass = $("#passwd").val();
    var username =$("#username").val()
    var repass = $("#L_repass").val();
    if(pass==null||repass==null) pass="null";
    else if(pass!=repass){
        swal("注册失败!", "两次密码不一致!", "warning");
        return false;
    }else if(pass.length<6||pass.length>16){
        swal("注册失败!", "当前密码长度不满足要求!", "warning");
        return false;
    }
    // if(verifyCode==sessionStorage.getItem("code")){//客户端第一次校验
    $.post('user/register', {
        mail:mail,
        code:verifyCode,
        password:pass,
        username:username
    }, function(result){
        if (result == 200) {
            swal({
                title: "恭喜您!",
                text: "您已经成功登陆啦!",
                icon: "success",
            }).then((value) => {
                window.location.href='/';
            });
        } else {
            swal({
                title: "注册/登录失败!",
                text: ""+result.message,
                icon: "error",
                button: "确认",
            });
        }
    });
}

function login(){
    var verifyCode = $("#vercode").val();
    var mail = $("#email").val();
    var password = $("#passwd").val();

    // if(verifyCode==sessionStorage.getItem("code")){//客户端第一次校验
    $.post('user/login', {
        mail:mail,
        code:verifyCode,
        password:password
        // ,
        // username:username
    }, function(result){
        if (result == 200) {
            swal({
                title: "恭喜您!",
                text: "您已经成功登陆啦!",
                icon: "success",
            }).then((value) => {
                window.location.href='/';
            });
        } else {
            swal({
                title: "登录失败!",
                text: ""+result,
                icon: "error",
                button: "确认",
            });
        }
    });
}