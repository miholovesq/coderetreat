import spock.lang.Specification

class FakeTest extends Specification {

    def "偽の世界は存在するのだ" () {
        when:
            def fakeWorld = new FakeWorld()
        then:
            fakeWorld.exist() ==  true
    }
}
