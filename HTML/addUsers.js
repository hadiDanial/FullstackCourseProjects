function clearAllFields()
{
    var name = document.getElementById("name");
    var email = document.getElementById("email");
    var phone = document.getElementById("phone");
    var password = document.getElementById("password");
    var active = document.getElementById("active");
    var productGroups = document.getElementById("groups");
    var roles = document.getElementById("roles");
    name.nodeValue = "";
    email.nodeValue = "";
    phone.nodeValue = "";
    password.nodeValue = "";
    active.nodeValue = false;
    productGroups.nodeValue = 1;
    roles.nodeValue = 1;
}

function toggleActivityStatus()
{
    var active = document.getElementById("active");
    var activeLabel = document.getElementById("activityStatus");
    if(active.checked)
    {
        activeLabel.textContent = "Active";
    }
    else
    {
        activeLabel.textContent = "Inactive";

    }
}