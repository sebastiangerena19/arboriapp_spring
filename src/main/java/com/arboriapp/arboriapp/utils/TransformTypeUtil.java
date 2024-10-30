package com.arboriapp.arboriapp.utils;

import com.arboriapp.arboriapp.dto.UserDTO;
import com.arboriapp.arboriapp.entities.User;
import org.modelmapper.ModelMapper;

public class TransformTypeUtil {

    public <T> T transformType(Object object, Class<T> to) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(object, to);
    }

}
