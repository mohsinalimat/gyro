// DO NOT EDIT | Generated by gyro

////////////////////////////////////////////////////////////////////////////////

#pragma mark - Imports

#import <Realm/Realm.h>

#pragma mark - Types

@class RLMShop;

#pragma mark - Defines & Constants

extern const struct RLMProductRelationships {
    __unsafe_unretained NSString *shop;
} RLMProductRelationships;

////////////////////////////////////////////////////////////////////////////////

#pragma mark - Interface

@interface RLMProduct : RLMObject

#pragma mark - Properties

@property RLMShop *shop;

@end
