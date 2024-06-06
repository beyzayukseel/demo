package com.example.demo.ddb

import arrow.core.Either
import com.example.demo.model.Failure
import com.example.demo.model.Success
import org.springframework.stereotype.Repository

@Repository
interface BaseRepo {

    val repoName: RepoName

    fun <T>createOrUpdateItem(item: T): Either<Success, Failure>

    fun <T>getItem(item: T): Either<Success, Failure>

    fun <T>deleteItem(item: T): Either<Success, Failure>
}

enum class RepoName{
    FINANCE,
    LISTING
}