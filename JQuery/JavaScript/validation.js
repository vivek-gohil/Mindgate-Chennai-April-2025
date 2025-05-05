function validations() {
    alert("Validations is working");
    let flag = true;
    let form = document.getElementById("employeeForm");

    if (form.firstname.value == "") {
        alert("Please enter your first name");
        flag = false;
    }

    if (form.lastname.value == "") {
        alert("Please enter your last name");
        flag = false;
    }
    if (form.email.value == "") {
        alert("Please enter your email");
        flag = false;
    }
    if (form.age.value == "") {
        alert("Please enter your age");
        flag = false;
    }

    return flag;
    // alert(form);
    // alert(form.firstname.value);
    // alert(form.lastname.value);
    // alert(form.email.value);
    // alert(form.age.value);
    // alert(form.country.value)
}