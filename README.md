# grailsTestBindingBug

This repo illustrates a problem I'm having with doing a partial mock on "MyService".  Executing ```grails test-app``` yields:

<pre>
Failure:  |
My spy should be called(spybug.MyControllerSpec)
 |
Too few invocations for:
1 * mockMyService.methodToSpy()   (0 invocations)
Unmatched invocations (ordered by similarity):
1 * mockMyService.serviceMethod()
1 * mockMyService.invokeMethod('methodToSpy', [])
1 * mockMyService.invokeMethod('println', ['in serviceMethod about to call methodToSpy'])
1 * mockMyService.invokeMethod('println', ['Back from methodToSpy'])
	at org.spockframework.mock.runtime.InteractionScope.verifyInteractions(InteractionScope.java:78)
	at org.spockframework.mock.runtime.MockController.leaveScope(MockController.java:76)
	at spybug.MyControllerSpec.My spy should be called(MyControllerSpec.groovy:22)
</pre>
