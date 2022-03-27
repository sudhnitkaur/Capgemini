
class Rectangle{
    constructor(height, width){
        this.height = height;
        this.width = width;
    }
}

var myClass = new Rectangle(20, 50);

console.log(myClass.height);
console.log(myClass.width);

myClass.height = 500;
myClass.width = 100;

console.log("Height : "+myClass.height);
console.log("Width : "+myClass.width);