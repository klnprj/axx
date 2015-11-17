import com.axx.Camera

class BootStrap {

    def init = { servletContext ->
        new Camera(name: 'uno').save(flush: true, failOnError: true)
    }
    def destroy = {
    }
}
