package io.github.linpeilie;

import com.ruoyi.wms.domain.bo.CheckOrderBo;
import com.ruoyi.wms.domain.bo.CheckOrderBoToCheckOrderMapper;
import com.ruoyi.wms.domain.bo.CheckOrderDetailBo;
import com.ruoyi.wms.domain.bo.CheckOrderDetailBoToCheckOrderDetailMapper;
import com.ruoyi.wms.domain.bo.InventoryBo;
import com.ruoyi.wms.domain.bo.InventoryBoToInventoryMapper;
import com.ruoyi.wms.domain.bo.InventoryHistoryBo;
import com.ruoyi.wms.domain.bo.InventoryHistoryBoToInventoryHistoryMapper;
import com.ruoyi.wms.domain.bo.ItemBo;
import com.ruoyi.wms.domain.bo.ItemBoToItemMapper;
import com.ruoyi.wms.domain.bo.ItemBrandBo;
import com.ruoyi.wms.domain.bo.ItemBrandBoToItemBrandMapper;
import com.ruoyi.wms.domain.bo.ItemCategoryBo;
import com.ruoyi.wms.domain.bo.ItemCategoryBoToItemCategoryMapper;
import com.ruoyi.wms.domain.bo.ItemSkuBo;
import com.ruoyi.wms.domain.bo.ItemSkuBoToItemSkuMapper;
import com.ruoyi.wms.domain.bo.MerchantBo;
import com.ruoyi.wms.domain.bo.MerchantBoToMerchantMapper;
import com.ruoyi.wms.domain.bo.MovementOrderBo;
import com.ruoyi.wms.domain.bo.MovementOrderBoToMovementOrderMapper;
import com.ruoyi.wms.domain.bo.MovementOrderDetailBo;
import com.ruoyi.wms.domain.bo.MovementOrderDetailBoToInventoryMapper;
import com.ruoyi.wms.domain.bo.MovementOrderDetailBoToMovementOrderDetailMapper;
import com.ruoyi.wms.domain.bo.ReceiptOrderBo;
import com.ruoyi.wms.domain.bo.ReceiptOrderBoToReceiptOrderMapper;
import com.ruoyi.wms.domain.bo.ReceiptOrderDetailBo;
import com.ruoyi.wms.domain.bo.ReceiptOrderDetailBoToInventoryMapper;
import com.ruoyi.wms.domain.bo.ReceiptOrderDetailBoToReceiptOrderDetailMapper;
import com.ruoyi.wms.domain.bo.ShipmentOrderBo;
import com.ruoyi.wms.domain.bo.ShipmentOrderBoToShipmentOrderMapper;
import com.ruoyi.wms.domain.bo.ShipmentOrderDetailBo;
import com.ruoyi.wms.domain.bo.ShipmentOrderDetailBoToInventoryBoMapper;
import com.ruoyi.wms.domain.bo.ShipmentOrderDetailBoToShipmentOrderDetailMapper;
import com.ruoyi.wms.domain.bo.WarehouseBo;
import com.ruoyi.wms.domain.bo.WarehouseBoToWarehouseMapper;
import com.ruoyi.wms.domain.entity.CheckOrder;
import com.ruoyi.wms.domain.entity.CheckOrderDetail;
import com.ruoyi.wms.domain.entity.CheckOrderDetailToCheckOrderDetailVoMapper;
import com.ruoyi.wms.domain.entity.CheckOrderToCheckOrderVoMapper;
import com.ruoyi.wms.domain.entity.Inventory;
import com.ruoyi.wms.domain.entity.InventoryHistory;
import com.ruoyi.wms.domain.entity.InventoryHistoryToInventoryHistoryVoMapper;
import com.ruoyi.wms.domain.entity.InventoryToInventoryVoMapper;
import com.ruoyi.wms.domain.entity.Item;
import com.ruoyi.wms.domain.entity.ItemBrand;
import com.ruoyi.wms.domain.entity.ItemBrandToItemBrandVoMapper;
import com.ruoyi.wms.domain.entity.ItemCategory;
import com.ruoyi.wms.domain.entity.ItemCategoryToItemCategoryVoMapper;
import com.ruoyi.wms.domain.entity.ItemSku;
import com.ruoyi.wms.domain.entity.ItemSkuToItemSkuVoMapper;
import com.ruoyi.wms.domain.entity.ItemToItemVoMapper;
import com.ruoyi.wms.domain.entity.Merchant;
import com.ruoyi.wms.domain.entity.MerchantToMerchantVoMapper;
import com.ruoyi.wms.domain.entity.MovementOrder;
import com.ruoyi.wms.domain.entity.MovementOrderDetail;
import com.ruoyi.wms.domain.entity.MovementOrderDetailToMovementOrderDetailVoMapper;
import com.ruoyi.wms.domain.entity.MovementOrderToMovementOrderVoMapper;
import com.ruoyi.wms.domain.entity.ReceiptOrder;
import com.ruoyi.wms.domain.entity.ReceiptOrderDetail;
import com.ruoyi.wms.domain.entity.ReceiptOrderDetailToReceiptOrderDetailVoMapper;
import com.ruoyi.wms.domain.entity.ReceiptOrderToReceiptOrderVoMapper;
import com.ruoyi.wms.domain.entity.ShipmentOrder;
import com.ruoyi.wms.domain.entity.ShipmentOrderDetail;
import com.ruoyi.wms.domain.entity.ShipmentOrderDetailToShipmentOrderDetailVoMapper;
import com.ruoyi.wms.domain.entity.ShipmentOrderToShipmentOrderVoMapper;
import com.ruoyi.wms.domain.entity.Warehouse;
import com.ruoyi.wms.domain.entity.WarehouseToWarehouseVoMapper;
import com.ruoyi.wms.domain.vo.CheckOrderDetailVo;
import com.ruoyi.wms.domain.vo.CheckOrderDetailVoToCheckOrderDetailMapper;
import com.ruoyi.wms.domain.vo.CheckOrderVo;
import com.ruoyi.wms.domain.vo.CheckOrderVoToCheckOrderMapper;
import com.ruoyi.wms.domain.vo.InventoryHistoryVo;
import com.ruoyi.wms.domain.vo.InventoryHistoryVoToInventoryHistoryMapper;
import com.ruoyi.wms.domain.vo.InventoryVo;
import com.ruoyi.wms.domain.vo.InventoryVoToInventoryMapper;
import com.ruoyi.wms.domain.vo.ItemBrandVo;
import com.ruoyi.wms.domain.vo.ItemBrandVoToItemBrandMapper;
import com.ruoyi.wms.domain.vo.ItemCategoryVo;
import com.ruoyi.wms.domain.vo.ItemCategoryVoToItemCategoryMapper;
import com.ruoyi.wms.domain.vo.ItemSkuVo;
import com.ruoyi.wms.domain.vo.ItemSkuVoToItemSkuMapper;
import com.ruoyi.wms.domain.vo.ItemVo;
import com.ruoyi.wms.domain.vo.ItemVoToItemMapper;
import com.ruoyi.wms.domain.vo.MerchantVo;
import com.ruoyi.wms.domain.vo.MerchantVoToMerchantMapper;
import com.ruoyi.wms.domain.vo.MovementOrderDetailVo;
import com.ruoyi.wms.domain.vo.MovementOrderDetailVoToMovementOrderDetailMapper;
import com.ruoyi.wms.domain.vo.MovementOrderVo;
import com.ruoyi.wms.domain.vo.MovementOrderVoToMovementOrderMapper;
import com.ruoyi.wms.domain.vo.ReceiptOrderDetailVo;
import com.ruoyi.wms.domain.vo.ReceiptOrderDetailVoToReceiptOrderDetailMapper;
import com.ruoyi.wms.domain.vo.ReceiptOrderVo;
import com.ruoyi.wms.domain.vo.ReceiptOrderVoToReceiptOrderMapper;
import com.ruoyi.wms.domain.vo.ShipmentOrderDetailVo;
import com.ruoyi.wms.domain.vo.ShipmentOrderDetailVoToShipmentOrderDetailMapper;
import com.ruoyi.wms.domain.vo.ShipmentOrderVo;
import com.ruoyi.wms.domain.vo.ShipmentOrderVoToShipmentOrderMapper;
import com.ruoyi.wms.domain.vo.WarehouseVo;
import com.ruoyi.wms.domain.vo.WarehouseVoToWarehouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConvertMapperAdapter {
  @Autowired
  @Lazy
  private MovementOrderDetailBoToMovementOrderDetailMapper movementOrderDetailBoToMovementOrderDetailMapper;

  @Autowired
  @Lazy
  private MovementOrderDetailBoToInventoryMapper movementOrderDetailBoToInventoryMapper;

  @Autowired
  @Lazy
  private ReceiptOrderDetailBoToInventoryMapper receiptOrderDetailBoToInventoryMapper;

  @Autowired
  @Lazy
  private MerchantBoToMerchantMapper merchantBoToMerchantMapper;

  @Autowired
  @Lazy
  private WarehouseVoToWarehouseMapper warehouseVoToWarehouseMapper;

  @Autowired
  @Lazy
  private InventoryHistoryVoToInventoryHistoryMapper inventoryHistoryVoToInventoryHistoryMapper;

  @Autowired
  @Lazy
  private WarehouseToWarehouseVoMapper warehouseToWarehouseVoMapper;

  @Autowired
  @Lazy
  private ReceiptOrderBoToReceiptOrderMapper receiptOrderBoToReceiptOrderMapper;

  @Autowired
  @Lazy
  private ShipmentOrderDetailBoToInventoryBoMapper shipmentOrderDetailBoToInventoryBoMapper;

  @Autowired
  @Lazy
  private CheckOrderDetailBoToCheckOrderDetailMapper checkOrderDetailBoToCheckOrderDetailMapper;

  @Autowired
  @Lazy
  private ReceiptOrderVoToReceiptOrderMapper receiptOrderVoToReceiptOrderMapper;

  @Autowired
  @Lazy
  private ItemBoToItemMapper itemBoToItemMapper;

  @Autowired
  @Lazy
  private InventoryHistoryToInventoryHistoryVoMapper inventoryHistoryToInventoryHistoryVoMapper;

  @Autowired
  @Lazy
  private ReceiptOrderDetailVoToReceiptOrderDetailMapper receiptOrderDetailVoToReceiptOrderDetailMapper;

  @Autowired
  @Lazy
  private CheckOrderVoToCheckOrderMapper checkOrderVoToCheckOrderMapper;

  @Autowired
  @Lazy
  private CheckOrderToCheckOrderVoMapper checkOrderToCheckOrderVoMapper;

  @Autowired
  @Lazy
  private ShipmentOrderDetailVoToShipmentOrderDetailMapper shipmentOrderDetailVoToShipmentOrderDetailMapper;

  @Autowired
  @Lazy
  private ItemBrandToItemBrandVoMapper itemBrandToItemBrandVoMapper;

  @Autowired
  @Lazy
  private MovementOrderBoToMovementOrderMapper movementOrderBoToMovementOrderMapper;

  @Autowired
  @Lazy
  private MovementOrderDetailVoToMovementOrderDetailMapper movementOrderDetailVoToMovementOrderDetailMapper;

  @Autowired
  @Lazy
  private ReceiptOrderDetailBoToReceiptOrderDetailMapper receiptOrderDetailBoToReceiptOrderDetailMapper;

  @Autowired
  @Lazy
  private MerchantToMerchantVoMapper merchantToMerchantVoMapper;

  @Autowired
  @Lazy
  private ItemCategoryBoToItemCategoryMapper itemCategoryBoToItemCategoryMapper;

  @Autowired
  @Lazy
  private ItemCategoryToItemCategoryVoMapper itemCategoryToItemCategoryVoMapper;

  @Autowired
  @Lazy
  private ReceiptOrderDetailToReceiptOrderDetailVoMapper receiptOrderDetailToReceiptOrderDetailVoMapper;

  @Autowired
  @Lazy
  private ItemToItemVoMapper itemToItemVoMapper;

  @Autowired
  @Lazy
  private InventoryVoToInventoryMapper inventoryVoToInventoryMapper;

  @Autowired
  @Lazy
  private CheckOrderDetailToCheckOrderDetailVoMapper checkOrderDetailToCheckOrderDetailVoMapper;

  @Autowired
  @Lazy
  private MovementOrderToMovementOrderVoMapper movementOrderToMovementOrderVoMapper;

  @Autowired
  @Lazy
  private ShipmentOrderDetailBoToShipmentOrderDetailMapper shipmentOrderDetailBoToShipmentOrderDetailMapper;

  @Autowired
  @Lazy
  private ReceiptOrderToReceiptOrderVoMapper receiptOrderToReceiptOrderVoMapper;

  @Autowired
  @Lazy
  private MerchantVoToMerchantMapper merchantVoToMerchantMapper;

  @Autowired
  @Lazy
  private ShipmentOrderVoToShipmentOrderMapper shipmentOrderVoToShipmentOrderMapper;

  @Autowired
  @Lazy
  private ShipmentOrderDetailToShipmentOrderDetailVoMapper shipmentOrderDetailToShipmentOrderDetailVoMapper;

  @Autowired
  @Lazy
  private CheckOrderDetailVoToCheckOrderDetailMapper checkOrderDetailVoToCheckOrderDetailMapper;

  @Autowired
  @Lazy
  private ItemCategoryVoToItemCategoryMapper itemCategoryVoToItemCategoryMapper;

  @Autowired
  @Lazy
  private InventoryHistoryBoToInventoryHistoryMapper inventoryHistoryBoToInventoryHistoryMapper;

  @Autowired
  @Lazy
  private ShipmentOrderBoToShipmentOrderMapper shipmentOrderBoToShipmentOrderMapper;

  @Autowired
  @Lazy
  private ItemBrandBoToItemBrandMapper itemBrandBoToItemBrandMapper;

  @Autowired
  @Lazy
  private InventoryToInventoryVoMapper inventoryToInventoryVoMapper;

  @Autowired
  @Lazy
  private MovementOrderDetailToMovementOrderDetailVoMapper movementOrderDetailToMovementOrderDetailVoMapper;

  @Autowired
  @Lazy
  private ItemSkuBoToItemSkuMapper itemSkuBoToItemSkuMapper;

  @Autowired
  @Lazy
  private ItemBrandVoToItemBrandMapper itemBrandVoToItemBrandMapper;

  @Autowired
  @Lazy
  private ItemVoToItemMapper itemVoToItemMapper;

  @Autowired
  @Lazy
  private ItemSkuToItemSkuVoMapper itemSkuToItemSkuVoMapper;

  @Autowired
  @Lazy
  private MovementOrderVoToMovementOrderMapper movementOrderVoToMovementOrderMapper;

  @Autowired
  @Lazy
  private ShipmentOrderToShipmentOrderVoMapper shipmentOrderToShipmentOrderVoMapper;

  @Autowired
  @Lazy
  private WarehouseBoToWarehouseMapper warehouseBoToWarehouseMapper;

  @Autowired
  @Lazy
  private CheckOrderBoToCheckOrderMapper checkOrderBoToCheckOrderMapper;

  @Autowired
  @Lazy
  private ItemSkuVoToItemSkuMapper itemSkuVoToItemSkuMapper;

  @Autowired
  @Lazy
  private InventoryBoToInventoryMapper inventoryBoToInventoryMapper;

  public MovementOrderDetail com_ruoyi_wms_domain_bo_MovementOrderDetailBoToMovementOrderDetail(MovementOrderDetailBo param) {
    return movementOrderDetailBoToMovementOrderDetailMapper.convert(param);}

  public Inventory com_ruoyi_wms_domain_bo_MovementOrderDetailBoToInventory(MovementOrderDetailBo param) {
    return movementOrderDetailBoToInventoryMapper.convert(param);}

  public Inventory com_ruoyi_wms_domain_bo_ReceiptOrderDetailBoToInventory(ReceiptOrderDetailBo param) {
    return receiptOrderDetailBoToInventoryMapper.convert(param);}

  public Merchant com_ruoyi_wms_domain_bo_MerchantBoToMerchant(MerchantBo param) {
    return merchantBoToMerchantMapper.convert(param);}

  public Warehouse com_ruoyi_wms_domain_vo_WarehouseVoToWarehouse(WarehouseVo param) {
    return warehouseVoToWarehouseMapper.convert(param);}

  public InventoryHistory com_ruoyi_wms_domain_vo_InventoryHistoryVoToInventoryHistory(InventoryHistoryVo param) {
    return inventoryHistoryVoToInventoryHistoryMapper.convert(param);}

  public WarehouseVo com_ruoyi_wms_domain_entity_WarehouseToWarehouseVo(Warehouse param) {
    return warehouseToWarehouseVoMapper.convert(param);}

  public ReceiptOrder com_ruoyi_wms_domain_bo_ReceiptOrderBoToReceiptOrder(ReceiptOrderBo param) {
    return receiptOrderBoToReceiptOrderMapper.convert(param);}

  public InventoryBo com_ruoyi_wms_domain_bo_ShipmentOrderDetailBoToInventoryBo(ShipmentOrderDetailBo param) {
    return shipmentOrderDetailBoToInventoryBoMapper.convert(param);}

  public CheckOrderDetail com_ruoyi_wms_domain_bo_CheckOrderDetailBoToCheckOrderDetail(CheckOrderDetailBo param) {
    return checkOrderDetailBoToCheckOrderDetailMapper.convert(param);}

  public ReceiptOrder com_ruoyi_wms_domain_vo_ReceiptOrderVoToReceiptOrder(ReceiptOrderVo param) {
    return receiptOrderVoToReceiptOrderMapper.convert(param);}

  public Item com_ruoyi_wms_domain_bo_ItemBoToItem(ItemBo param) {
    return itemBoToItemMapper.convert(param);}

  public InventoryHistoryVo com_ruoyi_wms_domain_entity_InventoryHistoryToInventoryHistoryVo(InventoryHistory param) {
    return inventoryHistoryToInventoryHistoryVoMapper.convert(param);}

  public ReceiptOrderDetail com_ruoyi_wms_domain_vo_ReceiptOrderDetailVoToReceiptOrderDetail(ReceiptOrderDetailVo param) {
    return receiptOrderDetailVoToReceiptOrderDetailMapper.convert(param);}

  public CheckOrder com_ruoyi_wms_domain_vo_CheckOrderVoToCheckOrder(CheckOrderVo param) {
    return checkOrderVoToCheckOrderMapper.convert(param);}

  public CheckOrderVo com_ruoyi_wms_domain_entity_CheckOrderToCheckOrderVo(CheckOrder param) {
    return checkOrderToCheckOrderVoMapper.convert(param);}

  public ShipmentOrderDetail com_ruoyi_wms_domain_vo_ShipmentOrderDetailVoToShipmentOrderDetail(ShipmentOrderDetailVo param) {
    return shipmentOrderDetailVoToShipmentOrderDetailMapper.convert(param);}

  public ItemBrandVo com_ruoyi_wms_domain_entity_ItemBrandToItemBrandVo(ItemBrand param) {
    return itemBrandToItemBrandVoMapper.convert(param);}

  public MovementOrder com_ruoyi_wms_domain_bo_MovementOrderBoToMovementOrder(MovementOrderBo param) {
    return movementOrderBoToMovementOrderMapper.convert(param);}

  public MovementOrderDetail com_ruoyi_wms_domain_vo_MovementOrderDetailVoToMovementOrderDetail(MovementOrderDetailVo param) {
    return movementOrderDetailVoToMovementOrderDetailMapper.convert(param);}

  public ReceiptOrderDetail com_ruoyi_wms_domain_bo_ReceiptOrderDetailBoToReceiptOrderDetail(ReceiptOrderDetailBo param) {
    return receiptOrderDetailBoToReceiptOrderDetailMapper.convert(param);}

  public MerchantVo com_ruoyi_wms_domain_entity_MerchantToMerchantVo(Merchant param) {
    return merchantToMerchantVoMapper.convert(param);}

  public ItemCategory com_ruoyi_wms_domain_bo_ItemCategoryBoToItemCategory(ItemCategoryBo param) {
    return itemCategoryBoToItemCategoryMapper.convert(param);}

  public ItemCategoryVo com_ruoyi_wms_domain_entity_ItemCategoryToItemCategoryVo(ItemCategory param) {
    return itemCategoryToItemCategoryVoMapper.convert(param);}

  public ReceiptOrderDetailVo com_ruoyi_wms_domain_entity_ReceiptOrderDetailToReceiptOrderDetailVo(ReceiptOrderDetail param) {
    return receiptOrderDetailToReceiptOrderDetailVoMapper.convert(param);}

  public ItemVo com_ruoyi_wms_domain_entity_ItemToItemVo(Item param) {
    return itemToItemVoMapper.convert(param);}

  public Inventory com_ruoyi_wms_domain_vo_InventoryVoToInventory(InventoryVo param) {
    return inventoryVoToInventoryMapper.convert(param);}

  public CheckOrderDetailVo com_ruoyi_wms_domain_entity_CheckOrderDetailToCheckOrderDetailVo(CheckOrderDetail param) {
    return checkOrderDetailToCheckOrderDetailVoMapper.convert(param);}

  public MovementOrderVo com_ruoyi_wms_domain_entity_MovementOrderToMovementOrderVo(MovementOrder param) {
    return movementOrderToMovementOrderVoMapper.convert(param);}

  public ShipmentOrderDetail com_ruoyi_wms_domain_bo_ShipmentOrderDetailBoToShipmentOrderDetail(ShipmentOrderDetailBo param) {
    return shipmentOrderDetailBoToShipmentOrderDetailMapper.convert(param);}

  public ReceiptOrderVo com_ruoyi_wms_domain_entity_ReceiptOrderToReceiptOrderVo(ReceiptOrder param) {
    return receiptOrderToReceiptOrderVoMapper.convert(param);}

  public Merchant com_ruoyi_wms_domain_vo_MerchantVoToMerchant(MerchantVo param) {
    return merchantVoToMerchantMapper.convert(param);}

  public ShipmentOrder com_ruoyi_wms_domain_vo_ShipmentOrderVoToShipmentOrder(ShipmentOrderVo param) {
    return shipmentOrderVoToShipmentOrderMapper.convert(param);}

  public ShipmentOrderDetailVo com_ruoyi_wms_domain_entity_ShipmentOrderDetailToShipmentOrderDetailVo(ShipmentOrderDetail param) {
    return shipmentOrderDetailToShipmentOrderDetailVoMapper.convert(param);}

  public CheckOrderDetail com_ruoyi_wms_domain_vo_CheckOrderDetailVoToCheckOrderDetail(CheckOrderDetailVo param) {
    return checkOrderDetailVoToCheckOrderDetailMapper.convert(param);}

  public ItemCategory com_ruoyi_wms_domain_vo_ItemCategoryVoToItemCategory(ItemCategoryVo param) {
    return itemCategoryVoToItemCategoryMapper.convert(param);}

  public InventoryHistory com_ruoyi_wms_domain_bo_InventoryHistoryBoToInventoryHistory(InventoryHistoryBo param) {
    return inventoryHistoryBoToInventoryHistoryMapper.convert(param);}

  public ShipmentOrder com_ruoyi_wms_domain_bo_ShipmentOrderBoToShipmentOrder(ShipmentOrderBo param) {
    return shipmentOrderBoToShipmentOrderMapper.convert(param);}

  public ItemBrand com_ruoyi_wms_domain_bo_ItemBrandBoToItemBrand(ItemBrandBo param) {
    return itemBrandBoToItemBrandMapper.convert(param);}

  public InventoryVo com_ruoyi_wms_domain_entity_InventoryToInventoryVo(Inventory param) {
    return inventoryToInventoryVoMapper.convert(param);}

  public MovementOrderDetailVo com_ruoyi_wms_domain_entity_MovementOrderDetailToMovementOrderDetailVo(MovementOrderDetail param) {
    return movementOrderDetailToMovementOrderDetailVoMapper.convert(param);}

  public ItemSku com_ruoyi_wms_domain_bo_ItemSkuBoToItemSku(ItemSkuBo param) {
    return itemSkuBoToItemSkuMapper.convert(param);}

  public ItemBrand com_ruoyi_wms_domain_vo_ItemBrandVoToItemBrand(ItemBrandVo param) {
    return itemBrandVoToItemBrandMapper.convert(param);}

  public Item com_ruoyi_wms_domain_vo_ItemVoToItem(ItemVo param) {
    return itemVoToItemMapper.convert(param);}

  public ItemSkuVo com_ruoyi_wms_domain_entity_ItemSkuToItemSkuVo(ItemSku param) {
    return itemSkuToItemSkuVoMapper.convert(param);}

  public MovementOrder com_ruoyi_wms_domain_vo_MovementOrderVoToMovementOrder(MovementOrderVo param) {
    return movementOrderVoToMovementOrderMapper.convert(param);}

  public ShipmentOrderVo com_ruoyi_wms_domain_entity_ShipmentOrderToShipmentOrderVo(ShipmentOrder param) {
    return shipmentOrderToShipmentOrderVoMapper.convert(param);}

  public Warehouse com_ruoyi_wms_domain_bo_WarehouseBoToWarehouse(WarehouseBo param) {
    return warehouseBoToWarehouseMapper.convert(param);}

  public CheckOrder com_ruoyi_wms_domain_bo_CheckOrderBoToCheckOrder(CheckOrderBo param) {
    return checkOrderBoToCheckOrderMapper.convert(param);}

  public ItemSku com_ruoyi_wms_domain_vo_ItemSkuVoToItemSku(ItemSkuVo param) {
    return itemSkuVoToItemSkuMapper.convert(param);}

  public Inventory com_ruoyi_wms_domain_bo_InventoryBoToInventory(InventoryBo param) {
    return inventoryBoToInventoryMapper.convert(param);}
}
