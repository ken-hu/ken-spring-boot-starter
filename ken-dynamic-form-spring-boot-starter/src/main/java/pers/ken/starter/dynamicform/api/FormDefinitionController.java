package pers.ken.starter.dynamicform.api;

import org.springframework.web.bind.annotation.*;

/**
 * @className: DynamicFormController
 * @CreatedAt: 2026/1/21
 * @Author ken
 */
@RestController
@RequestMapping("${dynamic-form.api-prefix:/api/dynamic-form}")
public class FormDefinitionController {

    @GetMapping("/{formKey}")
    public String getFormDefinition(@PathVariable String formKey, @RequestParam String appCode) {
        return "Dynamic Form Definition";
    }

}
