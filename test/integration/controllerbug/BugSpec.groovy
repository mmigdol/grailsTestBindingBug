package controllerbug

import grails.test.spock.IntegrationSpec

class BugSpec extends IntegrationSpec {

    void "parameters are bound properly"() {
        setup:
            def controller = new FooController()

        when: "url-encoded parameters are POSTed to someMethod"
            controller.request.method="POST"
            controller.request.contentType = "application/x-www-form-urlencoded"
            controller.params.name = 'hi there'
            controller.someMethod()

        then: "output is correct"
            controller.response.text == "hi there"
    }

}
