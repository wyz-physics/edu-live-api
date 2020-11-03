package com.macro.mall.tiny.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.macro.mall.tiny.modules.ums.entity.UmsAdmin;
import com.macro.mall.tiny.modules.ums.entity.UmsResource;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SpringSecurity需要的用户详情
 * Created by macro on 2018/4/26.
 */
public class AdminUserDetails implements UserDetails {
    private final UmsAdmin umsAdmin;
    private final List<UmsResource> resourceList;


    public AdminUserDetails(UmsAdmin umsAdmin, List<UmsResource> resourceList) {
        this.umsAdmin = umsAdmin;
        this.resourceList = resourceList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的角色
        return resourceList.stream()
                .map(role ->new SimpleGrantedAuthority(role.getId()+":"+role.getName()))
                .collect(Collectors.toList());
    }

    @Override
    @JsonIgnore
    public String getPassword() {
        return umsAdmin.getPassword();
    }

    @Override
    @JsonIgnore
    public String getUsername() {
        return umsAdmin.getUsername();
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isEnabled() {
        return umsAdmin.getStatus().equals(1);
    }

    public UmsAdmin getUmsAdmin() {
        return umsAdmin;
    }
}
