// DO NOT EDIT | Generated by gyro

////////////////////////////////////////////////////////////////////////////////

#pragma mark - Imports

#import <Realm/Realm.h>
#import "RLMTypes.h"

#pragma mark - Types

@class RLMShop;

#pragma mark - Defines & Constants

extern const struct RLMProductAttributes {
    __unsafe_unretained NSString *brand;
    __unsafe_unretained NSString *name;
    __unsafe_unretained NSString *price;
    __unsafe_unretained NSString *type;
} RLMProductAttributes;

extern const struct RLMProductRelationships {
    __unsafe_unretained NSString *shop;
} RLMProductRelationships;

////////////////////////////////////////////////////////////////////////////////

#pragma mark - Interface

@interface RLMProduct : RLMObject

#pragma mark - Properties

@property NSString *brand;
@property NSString *name;
@property long price;
@property RLMTypeA type;
@property RLMShop *shop;

@end
