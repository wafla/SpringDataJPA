package kr.ac.kumoh.ce.s20211391.mysqldb

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GunplaController(val service: MechanicService) {
    @GetMapping("/") // Root일 때 밑에 함수 실행
    fun welcome(): String{
        return "건플라 서버"
    }

    @GetMapping("/mechanics")
    fun getMechanicList(): List<Mechanic>{
        return service.getAllMechanics()
    }

    @GetMapping("/mechanic/join/gunpla")
    fun mechanicJoinList(): List<MechanicJoinGunplaDto> {
        return service.getMechanicJoinGunpla()
    }
}