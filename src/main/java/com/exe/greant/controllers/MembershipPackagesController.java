package com.exe.greant.controllers;

import com.exe.greant.dtos.MembershipPackagesDTO;
import com.exe.greant.services.MembershipPackagesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("membership-packages")
@RestController()
@RequiredArgsConstructor()
public class MembershipPackagesController {

    private final MembershipPackagesService service;

    @GetMapping()
    public ResponseEntity<List<MembershipPackagesDTO>> getAllMembershipPackages() {
        return ResponseEntity.ok(this.service.getAllMembershipPackages());
    }
}
