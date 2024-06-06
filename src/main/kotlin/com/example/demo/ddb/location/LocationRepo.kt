package com.example.demo.ddb.location

import arrow.core.Either
import com.example.demo.ddb.BaseRepo
import com.example.demo.ddb.RepoName
import com.example.demo.model.Failure
import com.example.demo.model.Success
import org.springframework.stereotype.Component

@Component
class LocationRepo: BaseRepo {
    override fun <T> createOrUpdateItem(item: T): Either<Success, Failure> {
        TODO("Not yet implemented")
    }

    override fun <T> getItem(item: T): Either<Success, Failure> {
        TODO("Not yet implemented")
    }

    override fun <T> deleteItem(item: T): Either<Success, Failure> {
        TODO("Not yet implemented")
    }

    override val repoName = RepoName.LISTING
}