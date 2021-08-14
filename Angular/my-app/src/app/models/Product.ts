export class Product
{
    // public id : number = 0;
    // public name: string = "";
    // public constructor(id: number, name: string)
    // { 
    //     this.id = id;
    //     this.name = name;
    // } 
    //Same thing with dependency injection
    public constructor(public id : number, public name : string, public price : number, public picture : string)
    { 


    }
}