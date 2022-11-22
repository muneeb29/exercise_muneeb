
function insertCustomer() {
    $('#insertDetails').click(function(e) {
        e.preventDefault();
        const regex_pattern = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

        var email = $('#email').val();
        var isValid = false;

        if (regex_pattern.test(email)) {
            isValid = true;
        }
        else {
            isValid = false;
            alert("Email isn't valid");
        }

        var title = $('#title').val();
        var first = $('#first').val();
        var last = $('#last').val();
        var line1 = $('#line1').val();
        var post = $('#post').val();

    if( isValid == true && email.length > 0 && title.length>0 && first.length>0 && last.length>0 && line1.length>0 && post.length>0) {
        var fList = {
            email_address: email,
            title: title,
            first_name: first,
            last_name: last,
            address_line_1: line1,
            address_line_2: $('#line2').val(),
            phone_number: $('#phone').val(),
            city: $('#city').val(),
            postcode: post
        }

        $.ajax({
            type: 'POST',
            url: 'insert_customer',
            dataType: 'json',
            data: JSON.stringify(fList),
            contentType: "application/json; charset=utf-8",
            complete: [
                function () {
                    alert("Registered");
                    window.location.href = "http://localhost:8080/success";
                }
            ],
        });

    }
    else{
        alert("Empty Fields Please Check Again!")
    }


    });

}


$(document).ready(function() {

    insertCustomer();

});




