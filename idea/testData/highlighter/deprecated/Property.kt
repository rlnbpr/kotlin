fun test() {
    <info descr="'val test1' is deprecated">test1</info>
    MyClass().<info descr="'val test2' is deprecated">test2</info>
    MyClass.<info descr="'val test3' is deprecated">test3</info>

    <info descr="'var test4' is deprecated">test4</info>
    MyClass().<info descr="'var test5' is deprecated">test5</info>
    MyClass.<info descr="'var test6' is deprecated">test6</info>
}

deprecated("'val test1' is deprecated") val <info>test1</info>: String = ""
deprecated("'var test4' is deprecated") var <info>test4</info>: String = ""

class MyClass() {
    deprecated("'val test2' is deprecated") val <info>test2</info>: String = ""
    deprecated("'var test5' is deprecated") var <info>test5</info>: String = ""

    class object {
         deprecated("'val test3' is deprecated") val <info>test3</info>: String = ""
         deprecated("'var test6' is deprecated") var <info>test6</info>: String = ""
    }
}