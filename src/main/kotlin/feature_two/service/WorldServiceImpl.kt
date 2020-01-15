package feature_two.service

class WorldServiceImpl(private val lowLevelAttribute: String) : WorldService {
    override fun world() = "World $lowLevelAttribute"
}