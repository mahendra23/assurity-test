import request from "supertest";
import { BASE_URL } from "../config";

const get_category_url = (categoryId: number) => `/Categories/${categoryId}/Details.json?catalogue=false`;

export type Promotion = {
  Id: number;
  Name: string;
  Description: string;
  Price: number;
  OriginalPrice?: number;
  Recommended?: boolean;
  MinimumPhotoCount: number;
};

export type Category = {
    CategoryId: number;
    Name: string;
    Path: string;
    CanListAuctions: boolean;
    CanListClassifieds: boolean;
    CanRelist: boolean;
    LegalNotice: string;
    DefaultDuration: number;
    AllowedDurations: number[];
    Fees: {
      Bundle: number;
      EndDate: number;
      Feature: number;
      Gallery: number;
      Listing: number;
      Reserve: number;
      Subtitle: number;
      TenDays: number;
      ListingFeeTiers: {
        MinimumTierPrice: number;
        FixedFee: number;
      }[];
      SecondCategory: number;
    };
    FreePhotoCount: number;
    MaximumPhotoCount: number;
    IsFreeToRelist: boolean;
    Promotions: Promotion[];
    EmbeddedContentOptions: any[];
    MaximumTitleLength: number;
    AreaOfBusiness: number;
    DefaultRelistDuration: number;
    CanUseCounterOffers: boolean;
};
export const getCategory = async (categoryId: number) => {
  const response = await request(BASE_URL)
    .get(get_category_url(categoryId))
  
  return response.body as Category;
};