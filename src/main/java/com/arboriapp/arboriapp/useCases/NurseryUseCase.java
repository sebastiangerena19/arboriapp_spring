package com.arboriapp.arboriapp.useCases;

import com.arboriapp.arboriapp.dto.NurseryDTO;
import com.arboriapp.arboriapp.repository.NurseryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class NurseryUseCase {
    @Autowired
    private NurseryRepository nurseryRepository;

    public String saveNursery(NurseryDTO nursery){

        return null;
    }

    public Optional<NurseryDTO> getNursery(String id) {
        return null;
    }

    public Optional<NurseryDTO> deleteNursery(String id) {
        return null;
    }

    public Optional<NurseryDTO> updateNursery(NurseryDTO nursery) {
        return null;
    }
}
