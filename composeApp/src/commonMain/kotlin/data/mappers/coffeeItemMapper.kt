package data.mappers

import data.dto.CoffeeItemDTO
import domain.CoffeeItem

fun CoffeeItemDTO.toCoffeeItem(): CoffeeItem {
    return CoffeeItem(id, name, description, price.toFloat(), image_url)
}