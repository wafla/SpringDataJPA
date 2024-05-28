package kr.ac.kumoh.ce.s20211391.mysqldb

import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class Gunpla (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    var mechanicId: Int,
    var grade: String,
    var date: LocalDate,
    var price: Int,
    var title: String
)
