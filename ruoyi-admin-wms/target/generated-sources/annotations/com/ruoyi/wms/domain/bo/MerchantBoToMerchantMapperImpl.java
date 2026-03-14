package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.Merchant;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class MerchantBoToMerchantMapperImpl implements MerchantBoToMerchantMapper {

    @Override
    public Merchant convert(MerchantBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Merchant merchant = new Merchant();

        merchant.setSearchValue( arg0.getSearchValue() );
        merchant.setCreateBy( arg0.getCreateBy() );
        merchant.setCreateTime( arg0.getCreateTime() );
        merchant.setUpdateBy( arg0.getUpdateBy() );
        merchant.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            merchant.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        merchant.setId( arg0.getId() );
        merchant.setMerchantCode( arg0.getMerchantCode() );
        merchant.setMerchantName( arg0.getMerchantName() );
        merchant.setMerchantType( arg0.getMerchantType() );
        merchant.setMerchantLevel( arg0.getMerchantLevel() );
        merchant.setBankName( arg0.getBankName() );
        merchant.setBankAccount( arg0.getBankAccount() );
        merchant.setAddress( arg0.getAddress() );
        merchant.setMobile( arg0.getMobile() );
        merchant.setTel( arg0.getTel() );
        merchant.setContactPerson( arg0.getContactPerson() );
        merchant.setEmail( arg0.getEmail() );
        merchant.setRemark( arg0.getRemark() );

        return merchant;
    }

    @Override
    public Merchant convert(MerchantBo source, Merchant target) {
        if ( source == null ) {
            return target;
        }

        target.setSearchValue( source.getSearchValue() );
        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        if ( target.getParams() != null ) {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.getParams().clear();
                target.getParams().putAll( map );
            }
            else {
                target.setParams( null );
            }
        }
        else {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.setParams( new LinkedHashMap<String, Object>( map ) );
            }
        }
        target.setId( source.getId() );
        target.setMerchantCode( source.getMerchantCode() );
        target.setMerchantName( source.getMerchantName() );
        target.setMerchantType( source.getMerchantType() );
        target.setMerchantLevel( source.getMerchantLevel() );
        target.setBankName( source.getBankName() );
        target.setBankAccount( source.getBankAccount() );
        target.setAddress( source.getAddress() );
        target.setMobile( source.getMobile() );
        target.setTel( source.getTel() );
        target.setContactPerson( source.getContactPerson() );
        target.setEmail( source.getEmail() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
