package com.exe.greant.services;

import com.exe.greant.dtos.MembershipPackagesDTO;
import com.exe.greant.repository.MembershipPackagesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor()
@Service()
public class MembershipPackagesService {

    private final MembershipPackagesRepository repository;


    public List<MembershipPackagesDTO> getAllMembershipPackages() {
        return this.repository.findAll().stream().map((pkg) -> {
            MembershipPackagesDTO dto = new MembershipPackagesDTO();
            dto.setName(pkg.getDetail());
            return dto;
        }).collect(Collectors.toList());
    }
}
