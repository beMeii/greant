package com.exe.greant.controllers;

import com.exe.greant.dtos.RolesDTO;
import com.exe.greant.services.RolesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("roles")
@RestController()
@RequiredArgsConstructor()
public class RolesController {

    private final RolesService service;

    @GetMapping()
    public ResponseEntity<List<RolesDTO>> getAllRoles() {
        return ResponseEntity.ok(this.service.getAllRoles());
    }
}
