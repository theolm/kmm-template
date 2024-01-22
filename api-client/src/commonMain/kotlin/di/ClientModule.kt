package di

import KtorClient
import engine
import org.koin.dsl.module

val commonModule = module {
    single {
        KtorClient(engine)
    }
}