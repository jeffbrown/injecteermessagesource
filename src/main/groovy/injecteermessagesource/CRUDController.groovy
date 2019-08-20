package injecteermessagesource

import io.micronaut.context.MessageSource
import io.micronaut.context.i18n.ResourceBundleMessageSource
import io.micronaut.http.annotation.Get

import javax.inject.Inject

class CRUDController<T> {

    protected final Class<T> clazz

    @Inject
    MessageSource messageSource

    protected CRUDController( Class<T> clazz ) {
        this.clazz = clazz
    }

}