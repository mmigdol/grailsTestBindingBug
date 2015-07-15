package controllerbug

class FooController {

    def index() { }

    def someMethod(String name) {
        log.warn "name is $name"
        render name
    }
}
