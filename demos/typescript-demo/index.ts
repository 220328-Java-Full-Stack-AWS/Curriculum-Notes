let myString: string = "helo, world!";

class MyClass { 
    private _width: number; 
    private _height: number; 
    private _test: [number, string];

    get area() { 
        return this._width * this._height; 
    } 
    set width(newWidth : number){
        console.log("setting width for square...");
        this._width = newWidth;
    }
    set height(newHeight : number){
        console.log("setting height for square...");
        this._height = newHeight;
    }

    set test(newValue: [number, string]) {
        console.log("Setting multiple values in one mutator?")
        this._test = newValue;
    }
} 
let obj = new MyClass();

obj.width = 10;
obj.height = 5;

console.log("area: " + obj.area);