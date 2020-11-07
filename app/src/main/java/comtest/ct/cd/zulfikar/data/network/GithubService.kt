package comtest.ct.cd.zulfikar.data.network

import comtest.ct.cd.zulfikar.schema.User
import retrofit2.http.GET

interface GithubService {

    @GET ("users")
    suspend fun fetchUserList(): List<User>
}
