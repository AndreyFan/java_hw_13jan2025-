package de.telran.onlineshop.controller;

import de.telran.onlineshop.dto.CategoryDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Tag(name = "Categories", description = "Контроллер для работы с категориями товаров",
        externalDocs = @ExternalDocumentation(
                description = "Ссылка на общую документацию по категориям",
                url = "https://example.com/docs/categories-controller"
        )
)
public interface CategoriesControllerInterface {
    @Operation(
            summary = "Все категории",
            description = "Позволяет получить все категории товаров, имеющиеся в магазине"
    )
    List<CategoryDto> getAllCategories();
    CategoryDto getCategoryById(@PathVariable @Valid Long id);
    CategoryDto getCategoryByName(@RequestParam String name);
    @Hidden // скрываем для Open Api
    void deleteCategories(@PathVariable Long id);

}
