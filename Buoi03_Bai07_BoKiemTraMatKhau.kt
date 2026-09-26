// Nguyen Ngoc Yen Nhi - 25810030
fun main() {
    val kiemTraDoDai: (String) -> Boolean = { matKhau ->
        matKhau.length >= 8
    }

    val matKhau1 = "abc123"
    val matKhau2 = "nhi1301"
    val matKhau3 = "kotlin26"

    println("Mật khẩu '$matKhau1' hợp lệ: ${kiemTraDoDai(matKhau1)}")
    println("Mật khẩu '$matKhau2' hợp lệ: ${kiemTraDoDai(matKhau2)}")
    println("Mật khẩu '$matKhau3' hợp lệ: ${kiemTraDoDai(matKhau3)}")
}