var x = 123
//alert('Alert from JS! My var is ' + (x+10));

console.log('My log, my ' + (typeof x) + ' is ' + x);

var y = 32451.24
console.log('Y ' + (typeof y) + ' is ' + y);

var str = 'My String';
console.log((typeof str) + ' is ' + str);

var b = true;
console.log((typeof b) + ' is ' + b);
var a = new Date();
console.log(a);

foo();

console.log(foo); // Writes the function text, can send function pointers

// if(confirm('Are you sure???'))
// {
//     console.log('Noooooooooooooo!!!!');
// }
// else
// {
//     console.log('Thank you for sparing my life...');
// }
// var input = prompt('Enter a number: ');
// fooWithVar(input);
// 0 - false, 1 - true

function foo()
{
    console.log('Foo Fighters!');
}

function fooWithVar(input)
{
    //debugger
    console.log('My input is: ' + input);
}


var arr = new Array();
arr.push(321);
arr.push("hello");
arr.push(4);

for(var i = 0; i < arr.length; i++)
    console.log(arr[i]);

function counter(num)
{
    for(i = 0; i < num; i++)
    {
        console.log(i);
    }
}

function toggleColor(val)
{
    if(val)
    {
        document.getElementById("btn").classList.add("red");
    }
    else{

        document.getElementById("btn").classList.remove("red");
    }
}
var toggleStatus = true;

function toggleHeader()
{
    var header = document.getElementById("header");
    if(toggleStatus)
    {
        
        header.style.visibility = 'hidden';
        document.getElementById("btn").textContent = "Show";
        toggleStatus = false;
    }
    else 
    {
        header.style.visibility = 'visible';
        document.getElementById("btn").textContent = "Hide";
        toggleStatus = true;
    }
}

function toggleHeader2()
{
    var header = document.getElementById("header2");
    header.classList.toggle("invisible");
}