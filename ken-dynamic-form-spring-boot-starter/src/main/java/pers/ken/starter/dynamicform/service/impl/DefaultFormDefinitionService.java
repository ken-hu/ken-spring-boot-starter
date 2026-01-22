package pers.ken.starter.dynamicform.service.impl;

import org.springframework.stereotype.Service;
import pers.ken.starter.dynamicform.service.FormDefinitionService;

/**
 * @className: FormServiceImpl
 * @CreatedAt: 2026/1/21
 * @Author ken
 */
@Service
public class DefaultFormDefinitionService implements FormDefinitionService {


    @Override
    public String getFormSchemaMetaByFormKey(String formKey) {
        return "";
    }
}
