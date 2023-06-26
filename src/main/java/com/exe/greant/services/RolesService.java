package com.exe.greant.services;

import com.exe.greant.dtos.RolesDTO;
import com.exe.greant.repository.RolesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service()
@RequiredArgsConstructor()
public class RolesService {

    private final RolesRepository repository;

    public List<RolesDTO> getAllRoles() {
        return this.repository.findAll().stream().map((role) -> {
            RolesDTO dto = new RolesDTO();
            dto.setName(role.getRoleName());
            return dto;
        }).collect(Collectors.toList());
    }
}
