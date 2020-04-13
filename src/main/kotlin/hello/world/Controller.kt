package hello.world

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.validation.Validated
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import javax.validation.constraints.Max

@Validated
@Controller
class Controller {

	@Get("/{n}")
	suspend fun test(@Max(10) n: Int) = withContext(Default) {
		delay(2000)
		n * n
	}

}
