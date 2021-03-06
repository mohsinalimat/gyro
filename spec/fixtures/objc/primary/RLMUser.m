// DO NOT EDIT | Generated by gyro

////////////////////////////////////////////////////////////////////////////////

#pragma mark - Imports

#import "RLMUser.h"

#pragma mark - Defines & Constants

const struct RLMUserAttributes RLMUserAttributes = {
    .birthday = @"birthday",
    .name = @"name"
};

const struct RLMUserRelationships RLMUserRelationships = {
    .fidelityCard = @"fidelityCard"
};

////////////////////////////////////////////////////////////////////////////////

#pragma mark - Implementation

@implementation RLMUser

#pragma mark - Superclass Overrides

+ (NSString *)primaryKey
{
    return @"name";
}

// Specify required properties
+ (NSArray *)requiredProperties
{
    return @[@"birthday"];
}

// Specify default values for required properties
+ (NSDictionary *)defaultPropertyValues
{
    return @{@"birthday" : [NSDate date]};
}

@end
