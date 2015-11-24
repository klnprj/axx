import com.axx.Camera
import com.axx.Role
import com.axx.User
import com.axx.UserRole

class BootStrap {

	def init = {

        if (!User.findByUsername('admin')) {
            def admin = new User('admin', 'password').save(failOnError: true)
            def roleAdmin = new Role('ROLE_ADMIN').save(failOnError: true)
            UserRole.create admin, roleAdmin

            def roleUser = new Role('ROLE_USER').save(failOnError: true)
            def user = new User('user', 'password').save(failOnError: true)
            UserRole.create user, roleUser

            User.withSession {
                it.flush()
                it.clear()
            }

            new Camera(name: 'uno').save(flush: true, failOnError: true)
        }
	}
}
