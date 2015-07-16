package controllerbug

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(FooController)
class FooControllerSpec extends Specification {

    void "test parameter binding"() {
        when:
        params.name = 'Chris Squire'
        controller.someMethod()

        then:
        response.text == 'Chris Squire'
    }
}
