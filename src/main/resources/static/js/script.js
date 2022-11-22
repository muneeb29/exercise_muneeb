
function insertCustomer() {
    $('#insertDetails').click(function(e) {
        e.preventDefault();

        var email = $('#email').val();
        var title = $('#title').val();
        var first = $('#first').val();
        var last = $('#last').val();
        var line1 = $('#line1').val();
        var post = $('#post').val();

    if(email.length > 0 && title.length>0 && first.length>0 && last.length>0 && line1.length>0 && post.length>0) {
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
            success: [
                function () {
                    alert("Registered");
                    window.location.href = "http://localhost:8081/success";
                }
            ],
            error: function () {
                alert("Please Check The Fields Once Again!.");
                window.location.href = "http://localhost:8081/success";
            }
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


