/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package petstore

import (
	"bytes"
	"encoding/json"
)

// ArrayOfArrayOfNumberOnly struct for ArrayOfArrayOfNumberOnly
type ArrayOfArrayOfNumberOnly struct {
	ArrayArrayNumber *[][]float32 `json:"ArrayArrayNumber,omitempty"`
}

// NewArrayOfArrayOfNumberOnly instantiates a new ArrayOfArrayOfNumberOnly object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewArrayOfArrayOfNumberOnly() *ArrayOfArrayOfNumberOnly {
    this := ArrayOfArrayOfNumberOnly{}
    return &this
}

// NewArrayOfArrayOfNumberOnlyWithDefaults instantiates a new ArrayOfArrayOfNumberOnly object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewArrayOfArrayOfNumberOnlyWithDefaults() *ArrayOfArrayOfNumberOnly {
    this := ArrayOfArrayOfNumberOnly{}
    return &this
}

// GetArrayArrayNumber returns the ArrayArrayNumber field value if set, zero value otherwise.
func (o *ArrayOfArrayOfNumberOnly) GetArrayArrayNumber() [][]float32 {
	if o == nil || o.ArrayArrayNumber == nil {
		var ret [][]float32
		return ret
	}
	return *o.ArrayArrayNumber
}

// GetArrayArrayNumberOk returns a tuple with the ArrayArrayNumber field value if set, zero value otherwise
// and a boolean to check if the value has been set.
func (o *ArrayOfArrayOfNumberOnly) GetArrayArrayNumberOk() ([][]float32, bool) {
	if o == nil || o.ArrayArrayNumber == nil {
		var ret [][]float32
		return ret, false
	}
	return *o.ArrayArrayNumber, true
}

// HasArrayArrayNumber returns a boolean if a field has been set.
func (o *ArrayOfArrayOfNumberOnly) HasArrayArrayNumber() bool {
	if o != nil && o.ArrayArrayNumber != nil {
		return true
	}

	return false
}

// SetArrayArrayNumber gets a reference to the given [][]float32 and assigns it to the ArrayArrayNumber field.
func (o *ArrayOfArrayOfNumberOnly) SetArrayArrayNumber(v [][]float32) {
	o.ArrayArrayNumber = &v
}

type NullableArrayOfArrayOfNumberOnly struct {
	Value ArrayOfArrayOfNumberOnly
	ExplicitNull bool
}

func (v NullableArrayOfArrayOfNumberOnly) MarshalJSON() ([]byte, error) {
    switch {
    case v.ExplicitNull:
        return []byte("null"), nil
    default:
		return json.Marshal(v.Value)
	}
}

func (v *NullableArrayOfArrayOfNumberOnly) UnmarshalJSON(src []byte) error {
	if bytes.Equal(src, []byte("null")) {
		v.ExplicitNull = true
		return nil
	}

	return json.Unmarshal(src, &v.Value)
}
