package woowacourse.shopping.presentation.model

data class UnCheckableCartProductModel(
    override val productModel: ProductModel,
    override val count: Int,
) : CartProductModel