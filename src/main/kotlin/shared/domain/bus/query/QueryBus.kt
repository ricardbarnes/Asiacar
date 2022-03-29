package shared.domain.bus.query

interface QueryBus {
    fun ask(query: Query): Response?
}