// Nguyen Ngoc Yen Nhi - 25810030
fun main() {
    val tuoi: Int = 65

    val loaiVe: String = if (tuoi < 18) {
        "Vé trẻ em"
    } else if (tuoi < 60) {
        "Vé người lớn"
    } else {
        "Vé người cao tuổi"
    }

    println("Loại vé: $loaiVe")
}