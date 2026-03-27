class student (var name: String) {
    var age: Int = 0
    var major: String = "Unknown"

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
    constructor(name: String, age: Int, major: String) : this(name) {
        this.age = age
        this.major = major
    }
}