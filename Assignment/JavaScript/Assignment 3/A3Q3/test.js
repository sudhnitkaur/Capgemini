class Rectangle{
    constructor(height, width){
        this.height = height;
      
    }

    getArea(){
        return this.height*this.width;
    }
}

var myClass = new Rectangle(4, 5);

console.log(myClass.height);


myClass.height = 50;


console.log("Height : "+myClass.height);

console.log("Area : "+myClass.getArea());

