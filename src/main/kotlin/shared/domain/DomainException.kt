package shared.domain

open class DomainException(
    message: String? = null,
    cause: Throwable? = null,
    enableSuppression: Boolean = true,
    writableStackTrace: Boolean = true
) :
    RuntimeException(message, cause, enableSuppression, writableStackTrace) {
}